package com.performance.module_4_279

class Feature279UseCase0(
    private val repository: Feature279Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
