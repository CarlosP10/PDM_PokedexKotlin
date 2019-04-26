package com.example.fragment.Adapters

import com.example.fragment.Models.Pokemon

interface AdapterSet {
    fun changeDataSet(newDataSet : ArrayList<Pokemon>)
}