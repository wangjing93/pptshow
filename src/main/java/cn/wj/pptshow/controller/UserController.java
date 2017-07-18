package cn.wj.pptshow.controller;

import cn.wj.pptshow.entity.User;
import cn.wj.pptshow.service.UserService;
import cn.wj.pptshow.util.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by WangJing on 2017/4/1.
 */
@Controller
@RequestMapping(value = {"/api/user"})
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "findById", method = RequestMethod.POST)
    @ResponseBody
    public ResultModel findById(Integer id) {
        User user = userService.findUserById(id);
        ResultModel resultModel = new ResultModel();
        resultModel.setCode(200);
        resultModel.setVersion("1.0.0");
        resultModel.addAttribute("user", user);
        return resultModel;
    }
}
