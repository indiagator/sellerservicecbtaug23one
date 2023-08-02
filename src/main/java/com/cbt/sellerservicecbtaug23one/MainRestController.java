package com.cbt.sellerservicecbtaug23one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class MainRestController
{

    @Autowired
    OrderService orderService;

    @GetMapping("get/order/all/sellerwise/{sellername}")
    public ResponseEntity<List<FullOrder>> getAllOrderSellerwise(@PathVariable String sellername,
                                                                 @RequestParam int count,
                                                                 @RequestParam String status)
    {
        return new ResponseEntity<>(orderService.getOrdersSellerwise(sellername), HttpStatus.OK);
    }

}
