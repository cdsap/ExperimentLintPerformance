package com.performance.module_4_187

class Feature187UseCase0(
    private val repository: Feature187Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
