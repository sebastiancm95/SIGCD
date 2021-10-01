/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var barriosSanPablo = ["Las Cruces", "Las Joyas", "María Auxiliadora", "La Puebla", "Las Quintanas", "Uriche", "La Amelia", "Las Pastoras"];
var barriosRinconSabanilla = ["Rincón de Ricardo", "Miraflores", "Calle Cordero", "Rinconada"];

function cargar_Barrios() {

    var distrito;
    var e = document.getElementById("exampleFormControlSelect1");
    distrito = e.options[e.selectedIndex].text;
    console.log(distrito);
    console.log("distrito");
    var select = document.getElementById("exampleFormControlSelect2");
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
