/**
 * data.js
 */
const str = `[{"id":1,"first_name":"Shelba","last_name":"Cathery","email":"scathery0@wikia.com","gender":"Female","salary":8136},
{"id":2,"first_name":"Abner","last_name":"Herche","email":"aherche1@ucla.edu","gender":"Male","salary":5966},
{"id":3,"first_name":"Brion","last_name":"Quartermain","email":"bquartermain2@virginia.edu","gender":"Male","salary":6437},
{"id":4,"first_name":"Vaclav","last_name":"Braidwood","email":"vbraidwood3@desdev.cn","gender":"Male","salary":7133},
{"id":5,"first_name":"Teressa","last_name":"Abramamovh","email":"tabramamovh4@eepurl.com","gender":"Female","salary":5138},
{"id":6,"first_name":"Maressa","last_name":"Goodfield","email":"mgoodfield5@wsj.com","gender":"Agender","salary":8087},
{"id":7,"first_name":"Chloris","last_name":"Aldrich","email":"caldrich6@so-net.ne.jp","gender":"Female","salary":7625},
{"id":8,"first_name":"Darda","last_name":"Christon","email":"dchriston7@furl.net","gender":"Female","salary":9639},
{"id":9,"first_name":"Leticia","last_name":"Alyutin","email":"lalyutin8@newsvine.com","gender":"Female","salary":5174},
{"id":10,"first_name":"Sue","last_name":"Parratt","email":"sparratt9@reuters.com","gender":"Female","salary":8078},
{"id":11,"first_name":"Jacquenette","last_name":"Richardot","email":"jrichardota@reference.com","gender":"Female","salary":8905},
{"id":12,"first_name":"Vic","last_name":"Aurelius","email":"vaureliusb@prlog.org","gender":"Genderfluid","salary":9132},
{"id":13,"first_name":"Morey","last_name":"Nilges","email":"mnilgesc@webeden.co.uk","gender":"Male","salary":8393},
{"id":14,"first_name":"Corinne","last_name":"Kernock","email":"ckernockd@sbwire.com","gender":"Female","salary":8166},
{"id":15,"first_name":"Celestine","last_name":"Mattiessen","email":"cmattiessene@nydailynews.com","gender":"Female","salary":7995}]`;
// json 문자열(객체) -> JSON.parse() -> 객체.
let members = JSON.parse(str);

let students = [{name: "Hong", age: 20 },{ name: "Choi", age: 21 }];
//			   [{"name":"Hong","age":20},{"name":"Choi","age":21}]
// 객체 -> JSON.stringify() -> json문자열.
let json = JSON.stringify(students);
console.log(json);
//console.log(json);

// 반복문(forEach) => 성별:Female 급여: 6000 이상인 사람을 출력.
str.forEach(elem => {
	let gen = elem.Female
	
		
}		

	


