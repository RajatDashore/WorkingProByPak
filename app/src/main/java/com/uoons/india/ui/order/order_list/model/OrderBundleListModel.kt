package com.uoons.india.ui.order.order_list.model

import com.google.gson.annotations.SerializedName
import org.lsposed.lsparanoid.Obfuscate

@Obfuscate
data class OrderBundleListModel(@SerializedName("status"  ) var status  : String?         = null,
                                @SerializedName("message" ) var message : String?         = null,
                                @SerializedName("Data"    ) var Data    : ArrayList<OrderListModel> = arrayListOf(),
                                @SerializedName("code"    ) var code    : Int?            = null)