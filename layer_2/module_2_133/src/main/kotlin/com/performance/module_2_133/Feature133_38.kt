package com.performance.module_2_133

class Feature133UseCase2(
    private val repository: Feature133Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
