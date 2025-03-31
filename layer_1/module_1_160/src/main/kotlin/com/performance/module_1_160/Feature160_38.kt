package com.performance.module_1_160

class Feature160UseCase2(
    private val repository: Feature160Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
