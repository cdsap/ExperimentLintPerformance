package com.performance.module_1_187

class Feature187UseCase1(
    private val repository: Feature187Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
