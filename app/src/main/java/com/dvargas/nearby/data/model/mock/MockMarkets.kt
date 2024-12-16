package com.dvargas.nearby.data.model.mock

import com.dvargas.nearby.data.model.Market
import com.dvargas.nearby.data.model.Rule

val mockMarkets = listOf(
    Market(
        id = "012576ea-4441-4b8a-89e5-d53f3104c7c4",
        categoryId = "146b1a88-b3d3-4232-8b8f-c006f1e86d",
        name = "Sabor Grill",
        description = "Churrascaria com cortes nobres e buffet variado. Experiência completa para os amantes de carne.",
        coupons = 10,
//        rules = listOf(
//            Rule(
//                id = "1",
//                description = "Válido até o dia 25/12",
//                marketId = "012576ea-4441-4b8a-89e5-d53f3104c7c4"
//            ),
//            Rule(
//                id = "2",
//                description = "Disponível apenas para consumo local",
//                marketId = "012576ea-4441-4b8a-89e5-d53f3104c7c4"
//            ),
//        ),
        latitude = -23.5579243090911,
        longitude = -46.6581485249887,
        address = "Av. Paulista - Bela Vista",
        phone = "(11) 94567-1212",
        cover = "https://images.unsplash.com/photo-1498654896293-37aacf113fd9?w=400&h=300"
    ),
    Market(
        id = "2bc11e34-5f30-4ba0-90fa-c1c98f649281",
        categoryId = "146b1a88-b3d3-4232-8b8f-c006f1e86d",
        name = "Café Central",
        description = "Café aconchegante com opções de lanches e bebidas artesanais. Perfeito para uma pausa relaxante.",
        coupons = 10,
//        rules = emptyList(),
        latitude = -23.559457108054344,
        longitude = -46.66252581753144,
        address = "Alameda Jaú - Jardim Paulista",
        phone = "(12) 3456-7890",
        cover = "https://images.unsplash.com/photo-15512118808-94e220e084d2?w=400&h=300"
    ),
    Market(
        id = "3de432ea-7a34-4df1-934f-9e343d2adf56",
        categoryId = "146b1a88-b3d3-4232-8b8f-c006f1e86d",
        name = "Bistrô Gourmet",
        description = "Um bistrô charmoso com pratos requintados e sobremesas exclusivas. Ideal para jantares românticos.",
        coupons = 15,
//        rules = emptyList(),
        latitude = -23.56183908124567,
        longitude = -46.6647934739123,
        address = "Rua Haddock Lobo - Jardins",
        phone = "(11) 99876-5432",
        cover = "https://images.unsplash.com/photo-1504674900247-0877df9cc836?w=400&h=300"
    ),
    Market(
        id = "4ec91f25-6d13-42a2-867a-bf4343ccdf98",
        categoryId = "146b1a88-b3d3-4232-8b8f-c006f1e86d",
        name = "Panificadora Primavera",
        description = "Padaria tradicional com pães frescos, bolos e doces feitos diariamente com ingredientes de alta qualidade.",
        coupons = 5,
//        rules = emptyList(),
        latitude = -23.56237481903412,
        longitude = -46.6661582741834,
        address = "Rua Oscar Freire - Pinheiros",
        phone = "(11) 91234-5678",
        cover = "https://images.unsplash.com/photo-1604908177093-a7dcdc694b11?w=400&h=300"
    )
)