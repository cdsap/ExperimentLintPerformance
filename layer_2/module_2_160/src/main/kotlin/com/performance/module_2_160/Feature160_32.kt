package com.performance.module_2_160

class Feature160UseCase0(
    private val repository: Feature160Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
