// 接收数据的promise对象
import dataObj from "./server.js"

function unGraduate(){
    dataObj.then(value => {
        if (value.data.code === 1201){
            window.location.href = "../user.html";
        }
    });
}