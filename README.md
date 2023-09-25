# NahComponents

[![](https://jitpack.io/v/joelnah/NahComponents.svg)](https://jitpack.io/#joelnah/NahComponents)

implementation 'com.github.joelnah:NahComponents:Tag'

Use

***스켈레톤 UI***

        LazyShimmerColumn(
            modifier = Modifier.weight(1f),
            data = data,
            shimmerCount = 20,
            header = {
                ShimmerHeader(data = headerData)
            },
            footer = {
                ShimmerFooter(data = footerData)
            },
            content = {
                ShimmerItem(it)
            }
        )

        fun ShimmerItem(
            data: String?,
        ) {
            val isLoading= data.isNullOrEmpty()
            Text(modifier = Modifier
                .shimmerEffect(isLoading),
                ...
            )
        }