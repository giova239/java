(function ($) {

	$('.sidenav').sidenav();
	$('.parallax').parallax();
	$(document).ready(function () {
		
		$('select').formSelect();
		$('.datepicker').datepicker({
			yearRange: 100,
			format: "yyyy-mm-dd"
		});

	});

})(jQuery);