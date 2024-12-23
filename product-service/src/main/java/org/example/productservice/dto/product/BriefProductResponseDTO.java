package org.example.productservice.dto.product;

import lombok.Builder;

@Builder
public record BriefProductResponseDTO(
        Integer id,
        String name,
        Float oldPrice,
        Float newPrice,
        String display,
        String processor,
        String card,
        String battery,
        String weight,
        Integer discountPercent,
        String ram,
        String storage,
        String mainImageUrl,
        Integer totalSold,
        Float averageRating,
        Integer feedbacksCount
) {
}
