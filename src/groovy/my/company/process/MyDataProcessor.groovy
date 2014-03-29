package my.company.process

import org.springframework.stereotype.Component
import org.springframework.context.annotation.Scope

@Component
@Scope("prototype") // return new object when requested
/***
 *     singleton – Return a single bean instance per Spring IoC container
 prototype – Return a new bean instance each time when requested
 request – Return a single bean instance per HTTP request. *
 session – Return a single bean instance per HTTP session. *
 globalSession – Return a single bean instance per global HTTP session. *
 */
class MyDataProcessor {

    String makeToUpperCase(String data){
             return data.toUpperCase()+ ":::::::::::::::"
    }
}
