import java.util.Scanner;
class prime{
	public static void main(String[] args){
		System.out.println("Hello");
	}
}

38.Async & Await:  Async is keyword to write before the function and it will return the promise. Even if we return a single line code inside that function it we return the promise only. Its is use to create asynchronous behivour inside that function. 
ex: let product= async()=>{
     return "Hello" 
}
let x= demo()
log(x)


Await: Await is keyword we need to write inside the async function where we need to stop the execution untill promise resolve and get the response  
Ex: let fetchUsers=()=>{
    console.log("Fetching...................");

    let user= fetch("https://dummyjson.com/users")
    console.log(user);
    user.then((res)=>{
        console.log(res);
        return res.json()
    }).then((res)=>{
        console.log(res);
    })
    console.log("Fetching is Completed..");
}
fetchUsers()

Note : Async and await both are use to handle the aynchronouse code in synchronous way. without async we cant use await keyword. async and await can be handle by using try and catch .

Try Block: Try block will execute first if any error occur in try block then immediately jump into the catch block.

Catch Block: Catch block code execute what a error come in try block .

Ex: async and await
let fetchUsers1= async()=>{
    console.log("Fetching...................");

    try{
        let user=await fetch("https://dummyjson.com/users")
        console.log(user);
        let data= await user.json()
        console.log(data);
        console.log("Fetching is Completed..");
    }catch{
        console.log("Error");
    }
}
fetchUsers1()





























