// let ar = [3,4,5,2,4,7,8,"welcome" ];
// let arr2= ["s", "e"];
// arr2=ar

// arr2.push("kkk");
// console.log(ar);
// console.log(arr2);
// ar[1] ="priya"
// ar.push("love");
// ar.pop();
// ar.unshift()
// console.log(ar);

// let a = 3;
// let b = a;
// a =5;
// console.log(a===b);
// console.log(a);
// console.log(b);
// let arr1 =["i1","i2"];
// let arr2 = arr1;
// // let arr2 =["i1","i2"];
// // arr1==arr2;
// // console.log(arr1===arr2);
// arr1.push("i7");
// console.log(arr1);
// console.log(arr2);


// let arr1 =[2,3,4,5];
// // let arr2 = arr1;
// arr1.push(99);
// console.log(arr1);

// three method to differnciate between array1 and array2
// let arr2 = arr1.slice(0);
// console.log(arr2);
// let arr2 =[].concat(arr1);
// arr1.push(100);
// console.log(arr2);
// console.log(arr1);
// console.log(arr2===arr1);


// let arr2 =[...arr1,2,3,45,5];
// arr1.push(34);
// arr2.push(21);
// console.log(arr2);
// console.log(arr1);

// const arr1 = [34,344,67,23];
// for(let arr of arr1){
//     console.log(" arr"+ arr);
// }
// for(let arr2 in arr1){
//     console.log("arr"+ arr2);
// }


// destructuring of array
// const arr =["kum","apo"];
// let a = arr[0];
// let b = arr[1];
// console.log(a);
// console.log(b);

// let arr = [2,3,4,44,54,66,78,99];
// let [arr1,arr2,...arr3]=arr;
// console.log(arr1);
// console.log(arr2);
// console.log(arr3);
//  const stud=[7,8,9,10,12]
const teacher = {
    name:"pakal",
    age:25,
    school:"mvm",
    amount:2500,
}
// teacher["stud"] = "student study"
// teacher[stud]="student study"
// console.log(teacher[stud]);
for(let key of Object.keys(teacher)){
    console.log(key + " " +teacher[key]);
}
// console.log(teacher.age);
// teacher.genter = "female";
// console.log(teacher.genter);
