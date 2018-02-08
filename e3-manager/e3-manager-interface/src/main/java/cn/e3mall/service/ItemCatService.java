package cn.e3mall.service;

import cn.e3mall.common.pojo.EasyUITreeNode;

import java.util.List;

/**
 *  商品分类管理
 */
public interface ItemCatService {

    List<EasyUITreeNode> getItemCatList(long parentId);
}
