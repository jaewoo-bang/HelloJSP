/**
 * todo1.js
 */
const students = [];
students.push({sname: "홍길동", score: 90});
for(let i = 0; i < students.length; i++) {
	if (students[i].score >= 100)
	console.log(`name: ${students[i].sname},
				 score: ${students[i].score}`);
}
//화면에 배열의 갯수만큼 회원정보를 출력하는 함수.
function showList1() {
	
//반복문. forEach
students.forEach((elem, idx, ary) => {
	let str1 = `<tr><td>${elem.sname}</td> <td>${elem.score}</td></tr>`
	document.querySelector('#tlist').innerHTML += str1;
	});	
}//end of show list().
showList1();
// 이벤트.
document.querySelector('#addlist').addEventListener('click', () =>{
	let sname = document.querySelector('#std_name').value;
	let score = document.querySelector('#std_score').value;
	// 필수값을 입력하세요!!
	if (sname == ''|| score == '') {
		window.alert('필수값을 입력하세요!!');
		return;
	}
	document.querySelector('<tbody>#tlist').innerHTML = '';
	//배열에 추가.
	students.push({sname: sname, score: score});
	showList1();
	// 입력값 초기화.
	document.querySelector('#std_name').value = '';
	document.querySelector('#std_score').value = '';
})