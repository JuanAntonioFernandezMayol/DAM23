function mymenu(){

    document.getElementById("menu-desplegado").classList.toggle("show")
}
window.onclick = function(event){
    if(!event.target.matches(".icono-menu")){
        let menu = document.getElementsByClassName("menu-contenido");
        let i;
        for(i = 0; i < menu.length; i++){
            let openMenu = menu[i];
            if(openMenu.classList.contains("show")){
                openMenu.classList.remove("show");
            }
        }
    }
}
