package com.performance.module_4_279

class Feature279UseCase2(
    private val repository: Feature279Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
