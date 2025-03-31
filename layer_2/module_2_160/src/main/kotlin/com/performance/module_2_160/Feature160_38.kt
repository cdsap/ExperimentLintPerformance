package com.performance.module_2_160

class Feature160UseCase2(
    private val repository: Feature160Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
