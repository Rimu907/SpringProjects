package com.jt.mapper;
import com.jt.pojo.Item;
import com.jt.pojo.ItemCat;
import com.jt.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Date:2021/12/10 15:31
 * @Author:NANDI_GUO
 */
public interface ItemCatMapper {
    List<ItemCat> getItemCatList();

    @Update("update item_cat set status = #{status}, updated = #{updated} where id = #{id}")
    void changeStatus(ItemCat itemCat);

    void saveItemCat(ItemCat itemCat);

    @Update("update item_cat set name = #{name}, updated = #{updated} where id = #{id}")
    void updateItemCat(ItemCat itemCat);

    @Delete("delete from item_cat where id = #{id}")
    void deleteItemCat(ItemCat itemCat);

    @Select("select count(1) from item")
    long findItemTotal();

    List<User> findItemList(@Param("start") int start, @Param("size") int size, @Param("query") String query);

    @Update("update item set status = #{status} where id = #{id}")
    void updateItemStatus(Item item);

    @Delete("delete from item where id = #{id}")
    void deleteItemById(Item item);
//
//    @Delete("delete from item_cat where parentId = #{parentId}")
//    void delete(ItemCat item);
//
//    @Select("select * from item_cat where parentId = #{parentId}")
//    List<ItemCat> selectList(ItemCat item);
//
}
