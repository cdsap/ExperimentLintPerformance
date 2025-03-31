package com.performance.module_2_212

class Feature212UseCase0(
    private val repository: Feature212Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
