function getPrincipal() {
	let user = null;
	$.ajax({
		async: false,
		type: "get",
		url: "/api/v1/auth/principal",
		dataType: "json",
		success: (response) => {
			user = response.data
		},
		error: (error) => {
			console.log(error)
		}
	});
	
	return user;
}

function loadHeader(user) {
	const authItems = document.querySelector('.auth-items');

	if(user == null) {
		authItems.innerHTML = `
			<button class="auth-button signin" type="button">로그인</button>
            <button class="auth-button signup" type="button">회원가입</button>
		`;
		
		const signin = document.querySelector(".signin");
		const signup = document.querySelector(".signup");
		
		signin.onclick = () => {
			location.href = "/auth/signin";
		}
		
		signup.onclick = () => {
			location.href = "/auth/signup";
		}
	}else{
		authItems.innerHTML = `
			<button class="auth-button username" type="button">${user.user_id}</button>
            <button class="auth-button logout" type="button">로그아웃</button>
		`;
		
		const username = document.querySelector(".username");
		const logout = document.querySelector(".logout");
		
		username.onclick = () => {
			alert(`
<< 회원정보 >>
아이디: ${user.user_id}
이름: ${user.user_name}
이메일: ${user.user_email}
			`);
		}
		
		logout.onclick = () => {
			location.replace("/logout");
		}
	}
}

let user = getPrincipal();

loadHeader(user);

function getUser() {
	return user;
}