package com.example.test.controller;
import com.example.test.model.SearchVO;
import org.springframework.web.bind.annotation.*;

@RestController // 여기는 컨트롤러라고 알려주는 @RestController 어노테이션 사용 , @RestController = @Controller + @ResponseBody ( JSON/XML RETURN )
@RequestMapping("/api") // 여기로 들어올 path를 지정할 @RequestMapping 어노테이션 사용 localhost:8080/api
public class GetAPIController {

    @RequestMapping(method = RequestMethod.GET, path = "/getRequest")   // localhost:8080/api/getRequest
    public String getRequest(){
        return "this is getRequest";
    }

    // GetMapping은 RequestMapping과는 다르게 메소드유형 없이 주소만 지정해주면된다.
    @GetMapping("/getParameters")  // localhost:8080/api/getParameters?id=shlee0882&email=shlee0882@gmail.com
    public String getParameters(@RequestParam String id, @RequestParam String email){
        return "아이디는 "+id+" 이메일은 "+email;
    }

    @GetMapping("/getParametersName")
    public String getParametersName(@RequestParam(name = "id") String userId
            , @RequestParam(name = "email") String userEmail){ //인자값 바꾸고 싶을 경우, 변수
        return "아이디는 "+userId+" 이메일은 "+userEmail;
    }
    
    //-> param 10개 이상이면 RequestParam 매번 만들수 없음 -> Model 객체 활용
    // http://localhost:8080/api/getMultiParameters?id=shlee0882&email=shlee0882@gmail.com
    @GetMapping("/getMultiParameters")
    public String getMultiParameters(SearchVO searchVo) {
        return "VO사용 아이디는 "+searchVo.getId()+" 이메일은 "+searchVo.getEmail();
    }

    //JSON 형태, SearchVO 타입 형태로 생성
    @GetMapping("/getMultiParametersRtnJson")
    public SearchVO getMultiParametersRtnJson(SearchVO searchVo) {
        return searchVo;
    }




}
