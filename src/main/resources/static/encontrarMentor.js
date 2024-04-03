// Inicialização do Swiper
var swiper = new Swiper(".swiper", {
  effect: "coverflow",
  grabCursor: true,
  centeredSlides: true,
  slidesPerView: "auto",
  coverflowEffect: {
    rotate: 0,
    stretch: 0,
    depth: 100,
    modifier: 2,
    slideShadows: true
  },
  spaceBetween: 60,
  loop: true,
  pagination: {
    el: ".swiper-pagination",
    clickable: true
  }
});

// Event listener para o clique no ícone de hambúrguer
document.getElementById("menu-toggle").addEventListener("click", function() {
  // Ajusta a largura do sidebar para torná-lo visível
  document.getElementById("sidebar").style.width = "250px";
});

// Event listener para o clique no sidebar para fechá-lo
document.getElementById("sidebar").addEventListener("click", function() {
  // Define a largura do sidebar de volta para 0 para escondê-lo
  this.style.width = "0";
});

// Alternância de visibilidade do sidebar usando jQuery
$(document).ready(function() {
  $("#menu-toggle").click(function() {
    $("#sidebar").toggle();
  });
});
