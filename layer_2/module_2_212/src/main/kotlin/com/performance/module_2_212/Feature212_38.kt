package com.performance.module_2_212

class Feature212UseCase2(
    private val repository: Feature212Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
