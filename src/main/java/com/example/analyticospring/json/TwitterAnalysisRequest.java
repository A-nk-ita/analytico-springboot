package com.example.analyticospring.json;

import com.example.analyticospring.entity.Analyzer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class TwitterAnalysisRequest {
    private Integer twitter_id;
    private String email;
    private String screen_name;
    private List<HashtagRequest> hashtags = new ArrayList<>();
    private Analyzer analyzer;
}
