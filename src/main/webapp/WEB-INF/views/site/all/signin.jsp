<link href="/mynaruter/mcss/login.css" rel="stylesheet" />

<div class="form-signin">
	<h1 class="h3 mb-3 font-weight-normal">Please sign in</h1>
	<input type="text" data-field="memberid" class="form-control" placeholder="ID" required autofocus>
	<input type="password" data-field="memberpwd" class="form-control" placeholder="Password" required>
	<div class="checkbox mb-3">
		<label> <input type="checkbox" value="remember-me">Remember me
		</label>
	</div>
	<button class="btn btn-lg btn-primary btn-block" id="logbtn">Sign
		in</button>
	<p class="mt-5 mb-3 text-muted">&copy; 2017-2018</p>
</div>
<script>

var logbtn = document.querySelector('#logbtn');
logbtn.addEventListener('click',function(){
	var inputs = document.querySelectorAll('input[data-field]');
	var param ={};
	for(var i=0;i<inputs.length;i++){
		var k = inputs[i].getAttribute('data-field');
		var v = inputs[i].value;
		param[k]=v ;
	}
	
	var conf = {
			url : 'mynaruter/signin',
			param : param,
			method : 'POST',
			success : togo
	}
	
	var au = new AjaxUtil(conf);
	au.send();
});

function togo(res){
	alert(res);
}
</script>