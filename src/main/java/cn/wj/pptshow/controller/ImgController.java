package cn.wj.pptshow.controller;

import cn.wj.pptshow.entity.Img;
import cn.wj.pptshow.util.ResultModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WangJing on 2017/4/1.
 */
@Controller
@RequestMapping(value = {"/api/img"})
public class ImgController {

    @RequestMapping(value = "", method = RequestMethod.GET)
    @ResponseBody
    @CrossOrigin
    public ResultModel list() {
        List<Img> imgs = new ArrayList<Img>();
        imgs.add(new Img(1,"http://139.129.240.174:8080/pptshow/images/img1.png",700,800));
        imgs.add(new Img(2,"http://139.129.240.174:8080/pptshow/images/img2.png",700,800));
        imgs.add(new Img(3,"http://139.129.240.174:8080/pptshow/images/img3.png",700,800));
        imgs.add(new Img(4,"http://139.129.240.174:8080/pptshow/images/img4.png",700,800));
        imgs.add(new Img(5,"http://139.129.240.174:8080/pptshow/images/img5.png",700,800));
        imgs.add(new Img(6,"http://139.129.240.174:8080/pptshow/images/img6.png",700,800));
        imgs.add(new Img(7,"http://139.129.240.174:8080/pptshow/images/img6.png",700,800));
        imgs.add(new Img(8,"http://139.129.240.174:8080/pptshow/images/img8.png",700,800));
        imgs.add(new Img(9,"http://139.129.240.174:8080/pptshow/images/img9.png",700,800));
        imgs.add(new Img(10,"http://139.129.240.174:8080/pptshow/images/img10.png",700,800));
        imgs.add(new Img(11,"http://139.129.240.174:8080/pptshow/images/img11.png",700,800));
        imgs.add(new Img(12,"http://139.129.240.174:8080/pptshow/images/img12.png",700,800));
        ResultModel resultModel = new ResultModel();
        resultModel.addAttribute("imgs",imgs);
        resultModel.setCode(200);
        resultModel.setVersion("1.0.0");
        return resultModel;
    }
}
