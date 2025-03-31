package com.performance.module_3_180

class Feature180UseCase0(
    private val repository: Feature180Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
