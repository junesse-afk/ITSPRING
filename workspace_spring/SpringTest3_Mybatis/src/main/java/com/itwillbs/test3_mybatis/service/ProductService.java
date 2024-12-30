package com.itwillbs.test3_mybatis.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itwillbs.test3_mybatis.StudentDAO;
import com.itwillbs.test3_mybatis.StudentDTO;
import com.itwillbs.test3_mybatis.mapper.ProductMapper;
import com.itwillbs.test3_mybatis.mapper.StudentMapper;
import com.itwillbs.test3_mybatis.vo.ProductVO;
import com.itwillbs.test3_mybatis.vo.StudentVO;

@Service
public class ProductService {
	
	@Autowired
	ProductMapper mapper;
	
	public <T> List<T> getProductList(Map<String, String> param) {
		return mapper.getProductList(param);
	}
	public int registProduct(ProductVO product) {
		return mapper.registProduct(product);
	}
	public int updateProduct(ProductVO product) {
		return mapper.updateProduct(product);
	}
	public int deleteProduct(String product_id) {
		return mapper.deleteProduct(product_id);
	}
	
//	public List<ProductVO> getProductList(Map<String, String> param) {
//	return mapper.getProductList(param);
//}
//	public List<ProductVO> getProductList(Map<String, String> param) {
//	return mapper.getProductList(param);
//}
//public ProductVO getProductList(Map<String, String> param) {
//	return mapper.getProductList(param);
//}
//public ProductVO getProduct(String product_id) {
//	return mapper.getProduct(product_id);
//}
	
}
