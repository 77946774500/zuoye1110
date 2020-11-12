package com.fh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Game;
import com.fh.model.GameParam;

import java.util.List;

/**
 * @author czx
 * @create 2020-11-10 18:31
 */
public interface GameMapper extends BaseMapper<Game> {
    List<Game> queryList(GameParam gameParam);

    long getTotalCount(GameParam gameParam);

    void addBatch(List<Game> list);
}
