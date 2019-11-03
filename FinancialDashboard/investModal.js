
// Get the modal

// Get the button that opens the modal
var btn = document.getElementById("investButton");


// When the user clicks on the button, open the modal
btn.onclick = function() { 
  var modal = document.getElementById("investModal");
  modal.style.display = "block";
  // When the user clicks on <span> (x), close the modal
  span.onclick = function() {
    modal.style.display = "none";
  }

  // When the user clicks anywhere outside of the modal, close it
  window.onclick = function(event) {
    if (event.target == modal) {
      modal.style.display = "none";
    }
  }
}