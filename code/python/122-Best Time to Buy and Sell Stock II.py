#!/usr/bin/env python
# -*- coding: utf-8 -*-
# create by manue1 6/23/18

class Solution(object):
    def maxProfit(self, prices):
        """
        :param prices: List[int]
        :return: int
        """
        res, i = 0, 0
        while i < len(prices):
            j = i
            while j + 1 < len(prices) and prices[j + 1] > prices[j]:
                j += 1
            res += prices[j] - prices[i]
            i = j + 1
        return res


if __name__ == '__main__':
    print Solution().maxProfit(prices=[7, 1, 5, 3, 6, 4])
