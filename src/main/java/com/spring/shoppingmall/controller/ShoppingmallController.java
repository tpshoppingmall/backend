package com.spring.shoppingmall.controller;

import com.spring.shoppingmall.dto.*;
import com.spring.shoppingmall.service.ExhibitionService;
import com.spring.shoppingmall.service.PatternDetailService;
import com.spring.shoppingmall.service.PatternService;
import com.spring.shoppingmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ShoppingmallController {

    @Autowired
    private ExhibitionService exhibitionService;

    @Autowired
    private PatternService patternService;

    @Autowired
    private PatternDetailService patternDetailService;

    @Autowired
    private ProductService productService;


    // 기획전 생성 관련 API
    @PostMapping("/regist/exhibition")
    public ResponseEntity<Map<String, Object>> registExhibition(@RequestBody ExhibitionRegistRequestDto requestDto) {
        Map<String, Object> resultMap = new HashMap<>();

        try {
            boolean result = exhibitionService.registExhibition(requestDto);

            if (result) {
                resultMap.put("success", true);
                resultMap.put("message", "기획전 등록이 완료되었습니다.");
                return ResponseEntity.ok(resultMap);
            } else {
                resultMap.put("success", false);
                resultMap.put("message", "기획전 등록에 실패했습니다.");
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
            }
        } catch (Exception e) {
            resultMap.put("success", false);
            resultMap.put("message", "기획전 등록 중 오류가 발생했습니다: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
        }
    }

    @PostMapping("/regist/pattern")
    public ResponseEntity<Map<String, Object>> registPattern(@RequestBody PatternRegistRequestDto requestDto) {
        Map<String, Object> resultMap = new HashMap<>();

        try {
            boolean result = patternService.registPattern(requestDto);

            if (result) {
                resultMap.put("success", true);
                resultMap.put("message", "패턴 등록이 완료되었습니다.");
                return ResponseEntity.ok(resultMap);
            } else {
                resultMap.put("success", false);
                resultMap.put("message", "패턴 등록에 실패했습니다.");
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
            }
        } catch (Exception e) {
            resultMap.put("success", false);
            resultMap.put("message", "패턴 등록 중 오류가 발생했습니다: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
        }
    }

    @PostMapping("/regist/detailPattern")
    public ResponseEntity<Map<String, Object>> registDetailPattern(@RequestBody PatternDetailRegistRequestDto requestDto) {
        Map<String, Object> resultMap = new HashMap<>();

        try {
            boolean result = patternDetailService.registPatternDetail(requestDto);

            if (result) {
                resultMap.put("success", true);
                resultMap.put("message", "상세 패턴 등록이 완료되었습니다.");
                return ResponseEntity.ok(resultMap);
            } else {
                resultMap.put("success", false);
                resultMap.put("message", "상세 패턴 등록에 실패했습니다.");
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
            }
        } catch (Exception e) {
            resultMap.put("success", false);
            resultMap.put("message", "상세 패턴 등록 중 오류가 발생했습니다: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
        }
    }

    @PostMapping("/regist/product")
    public ResponseEntity<Map<String, Object>> registProduct(@RequestBody ProductRegistRequestDto requestDto) {
        Map<String, Object> resultMap = new HashMap<>();

        try {
            boolean result = productService.registProduct(requestDto);

            if (result) {
                resultMap.put("success", true);
                resultMap.put("message", "상품 등록이 완료되었습니다.");
                return ResponseEntity.ok(resultMap);
            } else {
                resultMap.put("success", false);
                resultMap.put("message", "상품 등록에 실패했습니다.");
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
            }
        } catch (Exception e) {
            resultMap.put("success", false);
            resultMap.put("message", "상품 등록 중 오류가 발생했습니다: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
        }
    }

    // 기획전 삭제 관련 API
    @DeleteMapping("/delete/detailPattern")
    public ResponseEntity<Map<String, Object>> deleteDetailPattern(@RequestParam Long id) {
        Map<String, Object> resultMap = new HashMap<>();

        try {
            boolean result = patternDetailService.deletePatternDetail(id);

            if (result) {
                resultMap.put("success", true);
                resultMap.put("message", "상세 패턴이 삭제되었습니다.");
                return ResponseEntity.ok(resultMap);
            } else {
                resultMap.put("success", false);
                resultMap.put("message", "상세 패턴 삭제에 실패했습니다.");
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
            }
        } catch (Exception e) {
            resultMap.put("success", false);
            resultMap.put("message", "상세 패턴 삭제 중 오류가 발생했습니다: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
        }
    }

    @DeleteMapping("/delete/pattern")
    public ResponseEntity<Map<String, Object>> deletePattern(@RequestParam Long id) {
        Map<String, Object> resultMap = new HashMap<>();

        try {
            boolean result = patternService.deletePattern(id);

            if (result) {
                resultMap.put("success", true);
                resultMap.put("message", "패턴이 삭제되었습니다.");
                return ResponseEntity.ok(resultMap);
            } else {
                resultMap.put("success", false);
                resultMap.put("message", "패턴 삭제에 실패했습니다.");
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
            }
        } catch (Exception e) {
            resultMap.put("success", false);
            resultMap.put("message", "패턴 삭제 중 오류가 발생했습니다: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
        }
    }

    @DeleteMapping("/delete/product")
    public ResponseEntity<Map<String, Object>> deleteProduct(@RequestParam Long id) {
        Map<String, Object> resultMap = new HashMap<>();

        try {
            boolean result = productService.deleteProduct(id);

            if (result) {
                resultMap.put("success", true);
                resultMap.put("message", "상품이 삭제되었습니다.");
                return ResponseEntity.ok(resultMap);
            } else {
                resultMap.put("success", false);
                resultMap.put("message", "상품 삭제에 실패했습니다.");
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
            }
        } catch (Exception e) {
            resultMap.put("success", false);
            resultMap.put("message", "상품 삭제 중 오류가 발생했습니다: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
        }
    }

    // 기획전 리스트 출력 관련 API
    @GetMapping("/list/exhibition")
    public ResponseEntity<Map<String, Object>> getListExhibition() {
        Map<String, Object> resultMap = new HashMap<>();

        try {
            List<ExhibitionListResponseDto> exhibitionList = exhibitionService.getExhibitionList();

            if (exhibitionList != null) {
                resultMap.put("success", true);
                resultMap.put("data", exhibitionList);
                resultMap.put("message", "기획전 리스트 조회가 완료되었습니다.");
                return ResponseEntity.ok(resultMap);
            } else {
                resultMap.put("success", false);
                resultMap.put("message", "기획전 리스트 조회에 실패했습니다.");
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
            }
        } catch (Exception e) {
            resultMap.put("success", false);
            resultMap.put("message", "기획전 리스트 조회 중 오류가 발생했습니다: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
        }
    }

    @GetMapping("/list/detailExhibition")
    public ResponseEntity<Map<String, Object>> getListDetailExhibition(@RequestParam Long exhibitionId) {
        Map<String, Object> resultMap = new HashMap<>();

        try {
            ExhibitionListResponseDto exhibition = exhibitionService.getExhibitionDetail(exhibitionId);

            if (exhibition != null) {
                resultMap.put("success", true);
                resultMap.put("data", exhibition);
                resultMap.put("message", "기획전 상세보기 조회가 완료되었습니다.");
                return ResponseEntity.ok(resultMap);
            } else {
                resultMap.put("success", false);
                resultMap.put("message", "기획전을 찾을 수 없습니다.");
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resultMap);
            }
        } catch (Exception e) {
            resultMap.put("success", false);
            resultMap.put("message", "기획전 상세보기 조회 중 오류가 발생했습니다: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
        }
    }

    @GetMapping("/list/product")
    public ResponseEntity<Map<String, Object>> getListProduct(@RequestParam(required = false) Long exhibitionId) {
        Map<String, Object> resultMap = new HashMap<>();

        try {
            List<ProductListResponseDto> productList;

            if (exhibitionId != null) {
                // 특정 기획전의 상품 목록 -구현해야함
                productList = productService.getProductList(); // 임시로 전체 목록
            } else {
                // 전체 상품 목록
                productList = productService.getProductList();
            }

            if (productList != null) {
                resultMap.put("success", true);
                resultMap.put("data", productList);
                resultMap.put("message", "상품 리스트 조회가 완료되었습니다.");
                return ResponseEntity.ok(resultMap);
            } else {
                resultMap.put("success", false);
                resultMap.put("message", "상품 리스트 조회에 실패했습니다.");
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
            }
        } catch (Exception e) {
            resultMap.put("success", false);
            resultMap.put("message", "상품 리스트 조회 중 오류가 발생했습니다: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(resultMap);
        }
    }
}