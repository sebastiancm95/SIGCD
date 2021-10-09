var barriosSanPablo = ["Las Cruces", "Las Joyas", "María Auxiliadora", "La Puebla", "Las Quintanas", "Uriche", "La Amelia", "Las Pastoras"];
var barriosRinconSabanilla = ["Rincón de Ricardo", "Miraflores", "Calle Cordero", "Rinconada"];
var ayudaTemporal = {pelicula: "", sala: "", fecha: "", hora: "", asiento: "", precio: ""};
var mode = 'A'; //adding

function render() {
    $("#peliculaId").val(proyeccion.pelicula);
    $("#salaId").val(proyeccion.sala);
    $("#fecha").val(proyeccion.fecha);
    $("#hora").val(proyeccion.hora);
    $("#precio").val(proyeccion.precio);
    switch (mode) {
        case 'A':
            $('#enviarSolicitudButton').off('click').on('click', add);
            break;
    }
}

function load() {
    ayudaTemporal = Object.fromEntries((new FormData($("#formularioAyudaTemporal").get(0))).entries());
}

function reset() {
    ayudaTemporal = {pelicula: "", sala: "", fecha: "", hora: "", asiento: "", precio: ""};
}

function add() {
    load();
    //if(!validar()) return;
    let request = new Request(url + '/ayuda-temporal', {method: 'POST', headers: {'Content-Type': 'application/json'}, body: JSON.stringify(ayudaTemporal)});
    (async () => {
        const response = await fetch(request);

        if (!response.ok) {
            //errorMessage(response.status, $("#add-modal #errorDiv"));
            console.log("error al agregar");
            return;
        }
        fetchAndList();
        reset();
    })();
}

function makenew() {
    reset();
    mode = 'A'; //adding
    render();
}

function fetchAndList() {
    let request = new Request(url + 'api/ayuda-temporal', {method: 'GET', headers: {}});
    (async () => {
        const response = await fetch(request);
        if (!response.ok) {
            //errorMessage(response.status, $("#buscarDiv #errorDiv"));
            return;
        }
        ayudaTemporal = await response.json();
    })();
}

function loaded() {
    reset();
    fetchAndList();
    $("#enviarSolicitudButton").click(makenew);
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
