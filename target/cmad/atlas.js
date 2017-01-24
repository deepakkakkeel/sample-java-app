$(document).ready(function(){
	$("#viewResults").hide();

   $("#viewButton").click(function() {
	   $.ajax({
		   url: 'http://localhost:8080/cmad/online/atlas/country/' + $("#name").val(),
		   type : 'get',
		   accept : 'application/json',
		   success : function(response) {
			   $("#viewButton").hide();
			   $("#viewForm").hide();
			   $('#country_name').html(response.name);
			   $('#capital').html(response.capital);
			   $('#currency').html(response.currencny);
			   $("#viewResults").show();
		   }
		   });
	   })
});