## api instruction


```shell script
curl -XPOST "http://localhost:18081/order/v1/10034/order/created" -H "Content-Type:application/json" -d '{
	"order": {
		"createDateTime": "2021-01-02 11:54:19",
		"goods": [
			{
				"sku":"c0001",
				"spu":"p02",
				"name": "apple",
				"desc": "this is america apple",
				"amount": 8,
				"weight": 12
			}
		]
	}
}'
```