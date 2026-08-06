function loadMessage(){
fetch("/message")
.then(response => response.text())
.then(data => alert(data));
}

function showMessage(){

fetch("/message")
.then(response => response.text())
.then(data => alert(data));

}

function loadMessage(){
alert("Thank you for visiting my portfolio!");
}