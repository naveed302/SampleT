// get all products on invoice page load
window.onload = myFunction();
	function myFunction() {

		alert("Hiiiiiiii");
		$.ajax({
					type : 'GET',
					url : 'http://localhost:8080/TechWeaver_INBM/product/getAllProducts',
					data : '',
					success : function(data) {
						alert(data);

						for (i in data) {

							alert(data[i].productId);
						}
					}
				});
	}


