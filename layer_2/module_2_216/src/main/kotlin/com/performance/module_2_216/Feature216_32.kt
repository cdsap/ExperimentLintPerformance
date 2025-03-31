package com.performance.module_2_216

class Feature216UseCase0(
    private val repository: Feature216Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
