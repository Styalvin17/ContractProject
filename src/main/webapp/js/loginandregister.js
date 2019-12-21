function log_in(){
	alert('login');
	var login_username=document.getElementById("login_username").value;
	var login_password=document.getElementById("login_password").value;
	
	var login_josn_text = {"username":login_username,"password":login_password};
	alert('ajax');
	 $.ajax({

				 url : "temphome/login",
				 type : "POST",
				 async : true,
				 data : JSON.stringify(login_josn_text),
		 		contentType:"application/json; charset=UTF-8",
				 dataType : 'text',
	            success:function(data){
					var url="main.html?auth="+data;
					window.location.href=url;
	            }
	        });
} 
function register(){
	alert('register');
	var register_username=document.getElementById("register_username").value;
	var register_password=document.getElementById("register_password").value;
	var register_password_again=document.getElementById("register_password_again").value;
	var register_Email=document.getElementById("register_Email").value;
	var register_josn_text = {"username":register_username,"password":register_password,"checkpassword":register_password_again,"email":register_Email};
	$.ajax({
	           type:"POST",
	           url:"temphome/register",
	           data:JSON.stringify(register_josn_text),
	           contentType:"application/json; charset=UTF-8",
				dataType : 'text',
	           success:function(data){
				   alert(data);
	           }
	       });
}
