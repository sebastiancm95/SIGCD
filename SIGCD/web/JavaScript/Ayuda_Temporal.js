var barriosSanPablo = ["Las Cruces", "Las Joyas", "María Auxiliadora", "La Puebla", "Las Quintanas", "Uriche", "La Amelia", "Las Pastoras"];
var barriosRinconSabanilla = ["Rincón de Ricardo", "Miraflores", "Calle Cordero", "Rinconada"];


var proyecciones = new Array();
var peliculas = new Array();
var salas = new Array();
var options = new Array();
var proyeccion = {pelicula: "", sala: "", fecha: "", hora: "", asiento: "", precio: ""};
var mode = 'A'; //adding


function render() {
    $("#peliculaId").val(proyeccion.pelicula);
    $("#salaId").val(proyeccion.sala);
    $("#fecha").val(proyeccion.fecha);
    $("#hora").val(proyeccion.hora);
    $("#precio").val(proyeccion.precio);
    switch (mode) {
        case 'A':
            $('#crearProyeccion').off('click').on('click', add);
            break;
    }
    $("#add-modal #errorDiv").html("");
    $('#add-modal').modal('show');
}

//function myFunction() {
//var combo = document.getElementById("peliculas");
//
//var selected = combo.options[combo.selectedIndex].text;
//alert(selected);
//  document.getElementById($("result")).innerHTML = selected;
//  console.log(selected);
//}

function load() {
    proyeccion = Object.fromEntries((new FormData($("#formulario").get(0))).entries());
}

function reset() {
    proyeccion = {pelicula: "", sala: "", fecha: "", hora: "", asiento: "", precio: ""};
}

function add() {
    load();

    //if(!validar()) return;
    let request = new Request(url + 'api/proyecciones', {method: 'POST', headers: {'Content-Type': 'application/json'}, body: JSON.stringify(proyeccion)});
    (async () => {
        const response = await fetch(request);

        if (!response.ok) {
            //errorMessage(response.status, $("#add-modal #errorDiv"));
            console.log("error al agregar");
            return;
        }
        fetchAndList();
        reset();
        $('#add-modal').modal('hide');
    })();
}

function list() {
    $("#listado").html("");
    proyecciones.forEach((p) => {
        row($("#listado"), p);
    });
}

function row(listado, proyeccion) {
    var tr = $("<tr />");
    tr.html("<td>" + proyeccion.id_proyeccion + "</td>" +
            "<td>" + proyeccion.pelicula + "</td>" +
            "<td>" + proyeccion.sala + "</td>" +
            "<td>" + proyeccion.fecha + "</td>" +
            "<td>" + proyeccion.hora + "</td>" +
            "<td>" + proyeccion.asiento + "</td>" +
            "<td>" + proyeccion.precio + "</td>");
    listado.append(tr);
}

function makenew() {
    reset();
    mode = 'A'; //adding
    render();
}

function fetchAndList() {
    let request = new Request(url + 'api/proyecciones', {method: 'GET', headers: {}});
    (async () => {
        const response = await fetch(request);
        if (!response.ok) {
            errorMessage(response.status, $("#buscarDiv #errorDiv"));
            return;
        }
        proyecciones = await response.json();
        list();
    })();
}

function recuperarPeliculas() {
    let request = new Request(url + 'api/peliculas', {method: 'GET', headers: {}});
    (async () => {
        const response = await fetch(request);
        if (!response.ok) {
            return;
        }
        peliculas = await response.json();
        var select = document.getElementById("peliculas");
        var iterador = peliculas.values();
        var i = 0;
        for (let pelicula of iterador) {
            select.options[i] = new Option(pelicula.id_pelicula + " " + pelicula.nombre);
            i++;
        }
    })();
}

function recuperarSalas() {
    let request = new Request(url + 'api/salas', {method: 'GET', headers: {}});
    (async () => {
        const response = await fetch(request);
        if (!response.ok) {
            return;
        }
        salas = await response.json();
        var select = document.getElementById("salas");
        var iterador = salas.values();
        var i = 0;
        for (let sala of iterador) {
            select.options[i] = new Option(sala.id_sala);
            i++;
        }
    })();
}

function loadFilmAndSala() {
    recuperarPeliculas();
    recuperarSalas();
}

function loaded() {
    reset();
    fetchAndList();
    $("#crear").click(makenew);
}

$(loaded);

function cargar_Barrios() {

    var distrito;
    var e = document.getElementById("distrito_Select");
    distrito = e.options[e.selectedIndex].text;
    console.log(distrito);
    console.log("distrito");
    var select = document.getElementById("barrio_Select");
    if (distrito === "San Pablo") {
        for (var i = 0; i < barriosSanPablo.length; i++) {
            select.options[i] = new Option(barriosSanPablo[i], barriosSanPablo[i]);
        }
    } else if (distrito === "Rincón de Sabanilla") {

        for (var i = 0; i < barriosRinconSabanilla.length; i++) {
            select.options[i] = new Option(barriosRinconSabanilla[i], barriosRinconSabanilla[i]);
        }
    }
}
