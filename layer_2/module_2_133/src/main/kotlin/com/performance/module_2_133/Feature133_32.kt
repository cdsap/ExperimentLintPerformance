package com.performance.module_2_133

class Feature133UseCase0(
    private val repository: Feature133Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
