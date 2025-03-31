package com.performance.module_1_187

class Feature187UseCase2(
    private val repository: Feature187Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
