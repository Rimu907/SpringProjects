package com.jt.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jt.mapper.ItemDescMapper;
import com.jt.mapper.ItemMapper;
import com.jt.pojo.Item;
import com.jt.pojo.ItemDesc;
import com.jt.vo.ItemVO;
import com.jt.vo.PageResult;
import com.jt.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @Date:2021/12/15 9:30
 * @Author:NANDI_GUO
 */
@Service
public class ItemServiceImpl implements ItemService{
     @Autowired
     private ItemMapper itemMapper;
     @Autowired
     private ItemDescMapper itemDescMapper;

    @Override
    public PageResult getItemList(PageResult pageResult) {

        QueryWrapper<Item> wrapper = new QueryWrapper<>();
        wrapper.like(StringUtils.hasLength(pageResult.getQuery()),"title", pageResult.getQuery());

        IPage<Item> page = new Page<>(pageResult.getPageNum(), pageResult.getPageSize());
        //page的参数由原来的页数/条数 金国业务调用添加了总记录数和分页的结果
        page = itemMapper.selectPage(page, wrapper);
        long total = page.getTotal();
        List<Item> rows = page.getRecords();

        return pageResult.setTotal(total).setRows(rows);
    }

    @Override
    public void updateItemStatus(Item item) {
        itemMapper.updateById(item);
    }

    @Override
    public void deleteItemById(Item item) {
        itemMapper.deleteById(item);
    }

    @Override
    @Transactional
    public void saveItem(ItemVO itemVO) {
        Item item = itemVO.getItem().setStatus(true);
        itemMapper.insert(item);

        ItemDesc itemDesc = itemVO.getItemDesc();
        itemDesc.setId(item.getId());
        itemDescMapper.insert(itemDesc);
    }
}
