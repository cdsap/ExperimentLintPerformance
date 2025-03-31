package com.performance.module_2_216

class Feature216UseCase2(
    private val repository: Feature216Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
