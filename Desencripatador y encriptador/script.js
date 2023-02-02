//Almacenando los datos de botones y cajas de texto a variables
let btnEncriptar = document.getElementById("encripta");
let btnDesencriptar = document.getElementById("desencripta");
let btnCopiar = document.getElementById("salida");
let entrada = document.getElementById("entrada");
let salida = document.getElementById("salida");
let texto;

//Activa las funciones a traves de eventos en los botones
btnEncriptar.addEventListener("click",fnEncriptar);
btnDesencriptar.addEventListener("click",fnDesencriptar);
btnCopiar.addEventListener("click", fnCopiar);


function fnEncriptar(){
    let valor=entrada.value;
    salida.value="";
    for(let i=0;i<valor.length;i++){
        salida.value+=compara(valor[i]);
    }
    entrada.value="";
            
}

function compara(letra){
    let retorno
    switch(letra){
        case "a":
            retorno="ai";
            break;
        case "e":
            retorno="enter";
            break;
        case "i":
            retorno="imes";
            break;
        case "o":
            retorno="ober";
            break
        case "u":
            retorno="ufat";
            break;
        default:
            retorno=letra;
            break;
    }
    return retorno
}

function fnDesencriptar(){
    let valor=entrada.value;
    texto=entrada.value;
    texto=texto.replace(/ai/g,"a");  
    texto=texto.replace(/enter/g,"e"); 
    texto=texto.replace(/imes/g,"i"); 
    texto=texto.replace(/ober/g,"o");  
    texto=texto.replace(/ufat/g,"u");
    salida.value=texto;
    entrada.value="";
            
}
        
function fnCopiar(){
    btnCopiar.select();
    btnCopiar.setSelectionRange(0, 99999);
    navigator.clipboard.writeText(btnCopiar.value);
}