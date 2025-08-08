<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/styles.css" rel="stylesheet" />
</head>
<body>
	검색: <select class="form-control" id="search"></select>
	<div id="show">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>센터ID</th>
					<th>센터명</th>
					<th>전화번호</th>
				</tr>
			</thead>
			<tbody id="list"></tbody>
		</table>
	</div>
	
	<script src="js/openapi.js"></script>
	<script>
	let url =`https://api.odcloud.kr/api/15077586/v1/centers?page=1&perPage=10&serviceKey=ViJEgXakqTi037qi2Gdx4FwFV7ODJzinv5JGid1JLs4JKcDEEvq54rPPzqGT0bgO%2FEqP4OVpr60mo68jdgH8uw%3D%3D`
		searchCenterList('대전광역시');
		
		function searchCenterList(sido) {
			search.addEventListener('click' e => {
				
			}
		fetch(url)
		.then(resolve => resolve.json())
		.then(result => {
			console.log(result.data[0]);
			result.data.forEach(elem => {
					if(elem.sido =='서울특별시') {
						
				let tr = document.createElement('tr');
				['id', 'centerName', 'phoneNumber'].forEach(prop => {
				let td = document.createElement('td');
				td.innerText = elem[prop];
				tr.appendChild(td);
			})
			document.getElementById('list').appendChild(tr);
					}
			});
			
		})
		.catch(err => console.error(err));
	}
	</script>
</body>
</html>