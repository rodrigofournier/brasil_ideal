modules = {
   jquery {
		resource url: '/js/jquery-1.8.2.js', disposition: 'head'
	}
   bootstrap {
	   dependsOn 'jquery'
	   resource url: '/css/bootstrap.min.css'
	   resource url: '/css/bootstrap-responsive.min.css'
	   resource url: 'js/bootstrap.min.js'
   }
}