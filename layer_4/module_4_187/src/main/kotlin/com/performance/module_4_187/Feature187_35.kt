package com.performance.module_4_187

class Feature187UseCase1(
    private val repository: Feature187Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
